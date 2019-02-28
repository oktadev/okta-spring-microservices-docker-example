# Spring Microservices and Docker

This example shows how to create a microservices architecture with Spring Boot and Spring Cloud. It also shows how to package each application in Docker containers and run them with Docker Compose.

Please read [Build Spring Microservices and Dockerize them for Production](https://developer.okta.com/blog/2019/02/28/spring-microservices-docker) for a tutorial that shows you how to build this application.

**Prerequisites:** [Java 8 or 11](https://adoptopenjdk.net/).

> [Okta](https://developer.okta.com/) has Authentication and User Management APIs that reduce development time with instant-on, scalable user infrastructure. Okta's intuitive API and expert support make it easy for developers to authenticate, manage and secure users and roles in any application.

* [Getting Started](#getting-started)
* [Help](#help)
* [Links](#links)
* [License](#license)

## Getting Started

To install this example application, run the following commands:

```bash
git clone https://github.com/oktadeveloper/okta-spring-microservices-docker-example.git
cd okta-spring-microservices-docker-example
```

### Create an Okta Developer Account

If you don't have one, [create an Okta Developer account](https://developer.okta.com/signup/). After you've completed the setup process, log in to your account and navigate to **Applications** > **Add Application**. Click **Web** and **Next**. On the next page, enter a name for your app (e.g., "Spring Docker"), then click **Done**. 

Copy your issuer (found under **API** > **Authorization Servers**), client ID, and client secret into `config-data/school-ui.properties`.

Create another Web application and name it something like "Spring Docker Production". Copy the client ID and secret into `config-data/school-ui-production.properties`. 

Run the following command from the root folder to create Docker containers for all your apps.

```shell
./mvnw clean install
```

Then you can start your microservices architecture using Docker Compose:

```shell
docker-compose up -d
```

**TIP:** You can use [Kitematic](https://kitematic.com/) to view your container logs and make sure everything starts OK.

After everything starts, you should be able to log in with your credentials at `http://localhost:8080`.

## Links

This example uses the following open source projects:

* [Okta Spring Boot Starter](https://github.com/okta/okta-spring-boot)
* [Spring Boot](https://spring.io/projects/spring-boot)
* [Spring Cloud](https://spring.io/projects/spring-cloud)
* [Spring Security](https://spring.io/projects/spring-security)

## Help

Please post any questions as comments on this repo's [blog post](https://developer.okta.com/blog/2019/02/28/spring-microservices-docker), or visit our [Okta Developer Forums](https://devforum.okta.com/). 

## License

Apache 2.0, see [LICENSE](LICENSE).