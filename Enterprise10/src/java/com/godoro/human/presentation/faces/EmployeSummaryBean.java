
package com.godoro.human.presentation.faces;


import com.godoro.human.business.document.EmployeeSummary;
import com.godoro.human.business.logic.EmployeeLogic;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;



@ManagedBean
@RequestScoped
public class EmployeSummaryBean {
    private EmployeeSummary employeeSummary;
    
    public EmployeSummaryBean(){
        long departmentId=0;
        HttpServletRequest request=(HttpServletRequest)
                FacesContext
                  .getCurrentInstance()
                  .getExternalContext()
                  .getRequest();
        if(request.getParameter("departmentId")!=null){
            departmentId=Long.parseLong(request.getParameter("departmentId"));
            request.getParameter("departmentId");
        }
        EmployeeLogic employeeLogic=new EmployeeLogic();
        employeeSummary=employeeLogic.listByDepartmentId(departmentId);
    }

    public EmployeeSummary getEmployeeSummary() {
        return employeeSummary;
    }

    public void setEmployeeSummary(EmployeeSummary employeeSummary) {
        this.employeeSummary = employeeSummary;
    }
    
}
