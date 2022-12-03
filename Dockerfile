FROM centos

WORKDIR /app

COPY src ./src
COPY build.gradle settings.gradle ./
COPY build/ /build/
COPY gradle/ /gradle/

EXPOSE 8080

RUN cd /etc/yum.repos.d/
RUN sed -i 's/mirrorlist/#mirrorlist/g' /etc/yum.repos.d/CentOS-*
RUN sed -i 's|#baseurl=http://mirror.centos.org|baseurl=http://vault.centos.org|g' /etc/yum.repos.d/CentOS-*

RUN yum install -y java-17-openjdk

ENV JAVA_HOME /usr/lib/jvm/jre-17-openjdk/
RUN export JAVA_HOME

RUN yum install -y curl
    
RUN curl -L https://services.gradle.org/distributions/gradle-7.5.1-bin.zip -o gradle-7.5.1-bin.zip
RUN yum install -y unzip
RUN unzip gradle-7.5.1-bin.zip
RUN echo 'export GRADLE_HOME=/app/gradle-7.5.1-bin.zip' >> $HOME/.bashrc
RUN echo 'export PATH=$PATH:$GRADLE_HOME/bin' >> $HOME/.bashrc
RUN /bin/bash -c "source $HOME/.bashrc"
ENV GRADLE_HOME=/app/gradle-7.5.1
ENV PATH=$PATH:$GRADLE_HOME/bin

ENTRYPOINT ["gradle", "bootRun"]

