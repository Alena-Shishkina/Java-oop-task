# Java-oop-task – Иерархия классов

Учебный проект: реализация иерархии классов продуктов и корзины покупок.

## Описание
Программа моделирует работу корзины покупателя.  
Поддерживаются продукты: мясо и яблоки разных цветов.  
Реализован расчёт стоимости:
- Общая сумма без скидки
- Общая сумма со скидкой
- Сумма вегетарианских продуктов

## Структура
- `model/` – классы продуктов (Food, Meat, Apple) и интерфейс `Discountable`
- `model/constants/` – константы (скидки и цвета)
- `service/ShoppingCart` – корзина с методами подсчёта
- `Main` – точка входа в программу

## Установка и запуск
```bash
git clone git@github.com:Alena-Shishkina/Project_Sprint_2.git
cd Project_Sprint_2
mvn clean compile
mvn exec:java -Dexec.mainClass="ru.practicum.Main"

Требования
Java 11+

Maven 3+

Автор
Alena Shishkina
