# ============ 1. 빌드 스테이지 ============
FROM eclipse-temurin:17-jdk-alpine AS builder

# 작업 디렉터리
WORKDIR /app

# 1) Maven Wrapper 파일들 먼저 복사
COPY mvnw .
COPY .mvn .mvn
COPY pom.xml .

# 2) mvnw 실행 권한 부여
RUN chmod +x mvnw

# 3) src 복사
COPY src src

# 4) 의존성 다운로드 (mvnw는 sh로 실행)
RUN sh mvnw dependency:go-offline -B

# 5) JAR 패키징 (테스트 스킵)
RUN sh mvnw package -DskipTests -B

# ============ 2. 런타임 스테이지 ============
FROM eclipse-temurin:17-jre-alpine

WORKDIR /app

# 빌드된 JAR 복사 (와일드카드 사용)
COPY --from=builder /app/target/*.jar app.jar

# 보안: 비루트 사용자 생성
RUN addgroup -g 1001 -S spring && \
    adduser -S spring -u 1001 -G spring && \
    chown spring:spring /app

USER spring:spring

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/app/app.jar"]
