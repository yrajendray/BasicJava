import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        getEmpBasicDetail().parallelStream().forEach(data->System.out.println(data.getId()+" "+ data.getName()));

        getEmpBasicDetail().stream().filter(data-> null!=data)
                .filter(data-> data.getName().equals("Name0")).forEach(d -> System.out.println(d.getId()+ " "+d.getName()));


    }

    public static List<BasicEmployeeDetail> getEmpBasicDetail(){
        List<BasicEmployeeDetail> empList = new ArrayList<>();
        for(int i=0;i<3;i++){
            BasicEmployeeDetail detail = new BasicEmployeeDetail();
            detail.setId(i);
            detail.setName("Name"+i);
            empList.add(detail);
        }

        return empList;
    }

    public static List<Employee> getEmployee(){
        List<Employee> empList = new ArrayList<>();
        for(int i=0;i<3;i++){
            Employee emp = new Employee();
            emp.setId(i);
            emp.setDepartmentName("dep"+i);
            empList.add(emp);
        }
        return  empList;
    }
}