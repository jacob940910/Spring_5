import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.pk.dao.GoodDao;
import com.pk.domain.Good;

public class Main {

	public static void main(String[] args) {
		GenericXmlApplicationContext context = 
			new GenericXmlApplicationContext(
				"classpath:applicationContext.xml");
		
		GoodDao dao = 
			context.getBean(GoodDao.class);
		/*
		Good good = new Good();
		good.setCode(7);
		good.setName("감귤");
		good.setManufacture("제주도");
		good.setPrice(700);
		
		dao.insertGood(good);
		
		context.close();
		*/
		
		List<Good> list = dao.list();
		for(Good good : list) {
			System.out.println(good);
		}
		
		//데이터 1개 가져오기
		System.out.println("==============");
		System.out.println(dao.get(11));
		System.out.println(dao.get(12));
		context.close();

		
	}
}
