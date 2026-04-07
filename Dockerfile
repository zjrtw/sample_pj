# 경량 이미지 파일 선택
FROM eclipse-temurin:17-jre-alpine

# 작업 디렉토리 설정
WORKDIR /app

# ../out/artifacts/my_source_jar/my_source.jar 파일을 /app 으로 이동
COPY ./out/artifacts/gitalk_jar/gitalk.jar /app

# 포트 3000 open
#EXPOSE 3000

# 실행 커맨드  이미 workdir을  app 으로 지정 했기에 파일만
CMD [ "java",  "-jar", "gitalk.jar"]

