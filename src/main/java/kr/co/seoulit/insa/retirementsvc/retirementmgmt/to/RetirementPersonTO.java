package kr.co.seoulit.insa.retirementsvc.retirementmgmt.to;


import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class RetirementPersonTO {
    private String  empCode, empName, deptName, retirementDate, workplaceName;

	public String getEmpCode() {
		return empCode;
	}

	public void setEmpCode(String empCode) {
		this.empCode = empCode;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getRetirementDate() {
		return retirementDate;
	}

	public void setRetirementDate(String retirementDate) {
		this.retirementDate = retirementDate;
	}

	public String getWorkplaceName() {
		return workplaceName;
	}

	public void setWorkplaceName(String workplaceName) {
		this.workplaceName = workplaceName;
	}

	@Override
	public String toString() {
		return "RetirementPersonTO [empCode=" + empCode + ", empName=" + empName + ", deptName=" + deptName
				+ ", retirementDate=" + retirementDate + ", workplaceName=" + workplaceName + "]";
	}
    
	
}
