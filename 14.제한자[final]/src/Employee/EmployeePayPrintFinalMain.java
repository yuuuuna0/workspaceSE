package Employee;

public class EmployeePayPrintFinalMain {

	public static void main(String[] args) {
		Employee[] emps= {
				new SalaryEmployee(1, "KIM",30000000),
				new SalaryEmployee(2, "GIM",40000000),
				new SalaryEmployee(3, "VIM",40000000),
				new HourlyEmployee(4, "HONG", 100, 20000),
				new HourlyEmployee(5, "GO", 100, 9000)
		};
		for(Employee emp:emps) {
			emp.calculatePay();
			System.out.println("-------------"+emp.getName()+" 님 급여명세표-------------");
			emp.print();
			double incentive=emp.calculateIncentive();
			System.out.println("\t인센티브: "+incentive);
			System.out.println("------------------------------------------");
		}
		System.out.println("사원 인센티브율: "+Employee.INCENTIVE_RATE);
	}	
}
