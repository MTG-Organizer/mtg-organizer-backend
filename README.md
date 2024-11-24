Приложение разделено на три слоя:

1. Слой работы с БД (пакет db): JPA сущности, репозитории
2. Слой бизнес логики (пакет core): сущности бизнес логики, сервисы (в сервисах в основном вызываются методы
   репозиториев)
3. Слой API (пакет api): DTO, контроллеры

* JPA сущности конвертируются в сущности бизнес логики через библиотеку MapStruct (пакет common.converter)

# Как юзать
1. Установить PostgreSQL:
```
   sudo apt-get install lsb-release
   sudo sh -c 'echo "deb http://apt.postgresql.org/pub/repos/apt/ $(lsb_release -cs)-pgdg main" > /etc/apt/sources.list.d/pgdg.list'
   wget --quiet -O - https://postgresql.org/media/keys/ACCC4CF8.asc | sudo apt-key add -
   sudo apt-get update
   sudo apt-get -y install postgresql
   ```
2. Изменить пароль у пользователя `postgres`:
```
sudo -u postgres psql
ALTER USER postgres PASSWORD 'postgres';
```
3. Создать БД `mtg_organizer`: `CREATE DATABASE mtg_organizer;`
3. Проверить, что установлены Java 21 и Maven 3.9.9:
```
java --version
mvn --version
```
4. Запустить: `mvn spring-boot:run` (за `.env` файлом в ЛС в ТГ @sysfutex)
