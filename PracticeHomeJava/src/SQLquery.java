import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

class empAgeComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return (o1.age < o2.age) ? -1 : (o1.age > o2.age) ? 1 : 0;

	}
}

class empSalComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return (o1.salary < o2.salary) ? -1 : (o1.salary > o2.salary) ? 1 : 0;

	}
}

public class SQLquery {

	public static void main(String[] args) {

		BufferedReader rder = null;

		String query = "select firstName,lastName,salary where age>30 order by salary desc";
		try {
			rder = new BufferedReader(new FileReader("data"));
		} catch (FileNotFoundException e) {
			System.out.println("file not found");
		}

		String[] queryParts = query.split(" ");
		String sortAttr = queryParts[6].trim();
		Comparator<Employee> comparator = null;
		if (sortAttr.compareToIgnoreCase("age") == 0) {
			comparator = new empAgeComparator();
		} else if (sortAttr.compareToIgnoreCase("salary") == 0) {
			comparator = new empSalComparator();
		}
		TreeSet<Employee> res = new TreeSet<Employee>(comparator);
		String line = null;
		try {
			line = rder.readLine();
			line = rder.readLine();
		} catch (IOException e) {

		}
		String[] operands = null;
		String condition = queryParts[3];
		String operation = null;
		if (condition.contains(">=")) {
			operands = condition.split(">=");
			operation = ">=";
		} else if (condition.contains("<=")) {
			operands = condition.split("<=");
			operation = "<=";
		} else if (condition.contains(">")) {
			operands = condition.split(">");
			operation = ">";
		} else if (condition.contains("<")) {
			operands = condition.split("<");
			operation = "<";
		} else if (condition.contains("=")) {
			operands = condition.split("=");
			operation = "=";
		}

		int attrno = 0;
		switch (operands[0].trim().toLowerCase()) {
		case "age":
			attrno = 3;
			break;
		case "salary":
			attrno = 4;
			break;
		default:
			attrno = 0;
		}
		if (operation.compareTo(">=") == 0) {
			while (line != null) {
				String[] elements = line.split(",");
				int var = Integer.parseInt(elements[attrno].trim());
				if (var >= 25) {
					Employee p = new Employee(Integer.parseInt(elements[0]
							.trim()), elements[1].trim(), elements[2].trim(),
							Integer.parseInt(elements[3].trim()),
							Integer.parseInt(elements[4].trim()),
							elements[5].trim());
					res.add(p);
				}
				// System.out.println(line);
				try {
					line = rder.readLine();
				} catch (IOException e) {

				}
			}
		} else if (operation.compareTo("<=") == 0) {
			while (line != null) {
				String[] elements = line.split(",");
				int var = Integer.parseInt(elements[attrno].trim());
				if (var <= 25) {
					Employee p = new Employee(Integer.parseInt(elements[0]
							.trim()), elements[1].trim(), elements[2].trim(),
							Integer.parseInt(elements[3].trim()),
							Integer.parseInt(elements[4].trim()),
							elements[5].trim());
					res.add(p);
				}
				// System.out.println(line);
				try {
					line = rder.readLine();
				} catch (IOException e) {

				}
			}
		} else if (operation.compareTo(">") == 0) {
			while (line != null) {
				String[] elements = line.split(",");
				int var = Integer.parseInt(elements[attrno].trim());
				if (var > 25) {
					Employee p = new Employee(Integer.parseInt(elements[0]
							.trim()), elements[1].trim(), elements[2].trim(),
							Integer.parseInt(elements[3].trim()),
							Integer.parseInt(elements[4].trim()),
							elements[5].trim());
					res.add(p);
				}
				// System.out.println(line);
				try {
					line = rder.readLine();
				} catch (IOException e) {

				}
			}
		} else if (operation.compareTo("<") == 0) {
			while (line != null) {
				String[] elements = line.split(",");
				int var = Integer.parseInt(elements[attrno].trim());
				if (var < 25) {
					Employee p = new Employee(Integer.parseInt(elements[0]
							.trim()), elements[1].trim(), elements[2].trim(),
							Integer.parseInt(elements[3].trim()),
							Integer.parseInt(elements[4].trim()),
							elements[5].trim());
					res.add(p);
				}
				// System.out.println(line);
				try {
					line = rder.readLine();
				} catch (IOException e) {

				}
			}
		} else if (operation.compareTo("=") == 0) {
			while (line != null) {
				String[] elements = line.split(",");
				int var = Integer.parseInt(elements[attrno].trim());
				if (var == 25) {
					Employee p = new Employee(Integer.parseInt(elements[0]
							.trim()), elements[1].trim(), elements[2].trim(),
							Integer.parseInt(elements[3].trim()),
							Integer.parseInt(elements[4].trim()),
							elements[5].trim());
					res.add(p);
				}
				// System.out.println(line);
				try {
					line = rder.readLine();
				} catch (IOException e) {

				}
			}
		}

		String[] attrReq = queryParts[1].split(",");
		// System.out.println(res);
		if (queryParts[7].trim().compareToIgnoreCase("desc") == 0) {
			res = (TreeSet<Employee>) res.descendingSet();
			// System.out.println(res);
		}

		Iterator<Employee> itr = res.iterator();
		while (itr.hasNext()) {
			Employee emp = (Employee) itr.next();
			for (String string : attrReq) {
				String word = null;
				switch (string.trim().toLowerCase()) {
				case "id":
					word = emp.getId() + "";
					break;
				case "firstname":
					word = emp.getFname();
					break;
				case "lastname":
					word = emp.getLname();
					break;
				case "age":
					word = emp.getSalary() + "";
					break;
				case "salary":
					word = emp.getSalary() + "";
					break;
				case "title":
					word = emp.getTitle();
					break;
				default:
					System.out.println("invalid");

				}
				System.out.print(word + " ");
			}
			System.out.println();
		}

	}
}
