import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringJoiner;

public class Q3 {
	public static void main(String[] args) {
		List<Car> cars = new ArrayList<Car>();
		cars.add(new Car("Jeep", "Wrangler", 1986));
		cars.add(new Car("Honda", "Accord", 1976));
		cars.add(new Car("Toyota", "Camry", 1982));

		printList(cars);

		cars.sort(new Comparator<Car>() {
			@Override
			public int compare(Car car1, Car car2) {
				return car1.year - car2.year;
			}
		});

		printList(cars);
	}

	public static void printList(List<Car> list) {
		for (Car car : list) {
			System.out.println("Element : " + car);
		}
		System.out.println("*************");
	}
}

class Car implements Comparable<Car> {
	String make;
	String model;
	int year;

	public Car(String make, String model, int year) {
		this.make = make;
		this.model = model;
		this.year = year;
	}

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public int getYear() {
		return year;
	}

	@Override
	public String toString() {
		return new StringJoiner(", ", Car.class.getSimpleName() + "[", "]").add("make='" + make + "'")
				.add("model='" + model + "'").add("year=" + year).toString();
	}

	@Override
	public int compareTo(Car obj) {
		if (year == obj.year) {
			return 0;
		} else if (year > obj.year) {
			return 1;
		} else {
			return -1;
		}
	}
}