import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("config loaded");
		JdbcTemplate jdbctemplate=ctx.getBean("jdbcTemplate", JdbcTemplate.class);
//		int n=jdbctemplate.update("insert into student values(100,'Lakshmi',40.0,'aaas')");
//		int n=jdbctemplate.update("update student set name='love' where id=100");
		int n=jdbctemplate.update("delete from student where id=100");
		System.out.println("effected"+" " +n+" "+"row");
	}
	

}
