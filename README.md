
# ߓ RedisPubSubDemo

Проект демонстрирует реализацию механизма публикации и подписки сообщений с использованием **Redis Pub/Sub** и **Spring Boot** на языке **Kotlin**.

---

## ߚ Запуск проекта

### ߓ Требования:

- Java 21
- Gradle
- Redis Server (локально или через Docker)

### ߔ Команды для запуска:

```bash
# Клонируйте репозиторий
git clone https://github.com/your-username/RedisPubSubDemo.git
cd RedisPubSubDemo

# Запуск Redis (если нужен Docker)
docker run --name redis -p 6379:6379 -d redis

# Запуск приложения
./gradlew bootRun
```

---

## ߓ Публикация сообщения

Для публикации сообщения в Redis используйте:

```bash
curl --location --request POST 'http://127.0.0.1:8088/api/v1/message/publish?message=yahoo'
```

**Ответ:**
```
Published message
```

---

## ߓ Структура проекта

```
src/main/kotlin/uz/nodir/redispubsubdemo/
├── RedisPubSubDemoApplication.kt          # Точка входа
├── configuration/RedisConfiguration.kt    # Конфигурация Redis
├── controller/RedisController.kt          # REST контроллер
└── service/
    ├── RedisPublisher.kt                  # Отправка сообщений
    └── RedisSubscribeService.kt           # Подписка на канал
```

---

## ⚙️ Конфигурация Redis (`application.yml`)

```yaml
spring:
  redis:
    host: localhost
    port: 6379
```

---

## ߓ Используемые технологии

- Kotlin
- Spring Boot
- Spring Data Redis
- Redis Pub/Sub
