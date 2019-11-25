import citizens.*;
import enums.*;
import items.*;

public class Main {
	public static void main(String[] args) {

		Scenario scenario = new Scenario();
		scenario.add("Все персонажи являются вымышленными!" + 
					 "\nЛюбое совпадения с реальными людьми случайны. Но это не точно.\n");
		scenario.add("Они подошли и сели рядом с ней.");
		scenario.add("Мысли автора: Эти двое никогда не блистали умственными способностями, \n" + 
					 "              Поэтому то, что они копали ножами было не удивительно.\n" + 
					 "Тем временем в Космическом городе была тишина.");
		scenario.add("Не спали лишь Знайка и Профессор Звездочкин.");
		scenario.add("Это они производят вычисления траектории полета космического корабля. " +
					 "Он должен попасть точно в отверстие, имевшееся в лунной сфере,\n" +
					 "сквозь которое можно было выбраться на поверхность Луны.");

		Korotyshka pupsen = new Korotyshka("Злоумышленник Пупсень", LifeStyle.EVIL);
		ActItem secretLight= new ActItem("Потайной фонарь");
		Korotyshka vupsen = new Korotyshka("Злоумышленник Вупсень", LifeStyle.EVIL);
		NonActItem wall = new NonActItem("Стена");
		ActItem knife = new ActItem("Нож");
		Korotyshka ilya = new Korotyshka("Илья", LifeStyle.KIND);
		Korotyshka denis = new Korotyshka("Денис", LifeStyle.KIND);
		Korotyshka semen = new Korotyshka("Семён", LifeStyle.KIND);
		Korotyshka znajka = new Korotyshka("Знайка", LifeStyle.KIND);
		ActItem notebook = new ActItem("Тетрадь");
		Korotyshka professor = new Korotyshka("Профессор Звездочкин", LifeStyle.KIND);
		NonActItem moon = new NonActItem("Луна");

		scenario.get(0);
		secretLight.use(TypeMsg.HUMAN_ITEM, "", " включил ", ".", pupsen);
		vupsen.process("", " огляделся.");
		wall.use("Видят - ", ".");
		scenario.get(1);
		knife.use(TypeMsg.HUMAN_ITEM, "", " взял ", " и начал рыть им землю.", pupsen);
		knife.use(TypeMsg.HUMAN_ITEM, "", " взял ", " и тоже начал рыть им землю.", vupsen);
		scenario.get(2);
		ilya.process("Коротышка ", " сладко спит в кроватке. Видимо на пары он завтра не пойдет.");
		denis.process("", " дрыхнет без задних ног, ведь он опять знатно перебрал сегодняшним вечером.");
		semen.process("И ", " спит. Ночная мозговая активность у него сегодня слабая, поэтому он не лунатит.");
		scenario.get(3);
		notebook.use(TypeMsg.HUMAN_ITEM, "", " писал что-то в свою ", ".", znajka);
		professor.process("А ", " рассматривал небо. ");
		moon.use("На нем ярко была видна ", ".");
		scenario.get(4);
	}
}