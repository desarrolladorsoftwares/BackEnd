FROM openjdk:21-jdk-slim

RUN echo "deb http://deb.debian.org/debian bookworm main contrib non-free" > /etc/apt/sources.list && \
    echo "deb http://security.debian.org/debian-security bookworm-security main contrib non-free" >> /etc/apt/sources.list && \
    echo "deb http://deb.debian.org/debian bookworm-updates main contrib non-free" >> /etc/apt/sources.list && \
    apt-get update && apt-get install -y \
    libfreetype6 \
    libfontconfig1 \
    ttf-mscorefonts-installer \
    fontconfig \
    && rm -rf /var/lib/apt/lists/*

RUN mkdir -p /app/resources/Reportes

COPY target/Insumo.jar /app/Insumo.jar

COPY src/main/resources/Reportes/ /app/resources/Reportes/

EXPOSE 8083

WORKDIR /app

ENTRYPOINT ["java", "-jar", "Insumo.jar"]
