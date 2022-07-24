package lambdas.strategypattern;

import lambdas.employee.Employee;

public interface EmployeeFilter {

	public boolean filterEmployee(Employee employee);

}
