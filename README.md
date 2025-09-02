# Серверная часть приложения знакомств Alchemy

Этот проект представляет собой серверное приложение на Spring Framework, реализующее базовые CRUD-операции для работы с данными.

Проект подключен через Maven для управления зависимостями.

### Технологии

- Spring Boot
- Spring Data JPA - для работы с базой данных
- Maven - для управления зависимостями
- PostgreSQL - база данных

### Архитектура

- Models - Сущности данных
- DTO - Data Transfer Objects
- Repository - Интерфейсы репозиториев
- Services - Интерфейсы сервисов
- Impl - Реализации сервисов
- Controllers - Контроллеры REST API

Тестирование работы сервера было проведено в `Postman`: 

<img width="281" height="511" alt="Снимок экрана 2025-09-02 в 19 54 11" src="https://github.com/user-attachments/assets/e39416ea-7a79-4530-ad9b-0a158c316b65" />
<img width="280" height="563" alt="Снимок экрана 2025-09-02 в 19 54 20" src="https://github.com/user-attachments/assets/0d35a045-2408-43a2-8ae8-1257caa4224e" />


[Клиентская часть приложения](https://github.com/aakulovaa/dating.git)
