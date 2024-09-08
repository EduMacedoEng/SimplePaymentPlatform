# Usar uma imagem base do Java 21 (JDK)
FROM eclipse-temurin:21-jdk-alpine

# Cria um volume para armazenar arquivos temporários em /tmp
VOLUME /tmp

# Definir os argumentos (o JAR será adicionado durante o build)
ARG JAR_FILE
ADD ${JAR_FILE} app.jar

# Definir argumentos opcionais para o nome e versão do aplicativo
ARG APP_NAME
ENV APP_NAME=${APP_NAME}

ARG APP_VERSION
ENV APP_VERSION=${APP_VERSION}

# Definir variáveis de ambiente do Java (JVM)
ENV JVM_MAX_HEAP_SIZE=512m

# Comando para executar o JAR da aplicação com configurações otimizadas da JVM
CMD java \
    -XX:+UnlockExperimentalVMOptions \
    -XX:+UseContainerSupport \
    -XX:+UseG1GC \
    -Xmx${JVM_MAX_HEAP_SIZE} ${JAVA_OPTS} \
    -jar app.jar

