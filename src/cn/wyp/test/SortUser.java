package cn.wyp.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class SortUser {
	public void test01(){
		List<User> list=new ArrayList<User>();
		long now =new Date().getTime();
		list.add(new User("zhangsan", now));
		list.add(new User("lisi", now+1000*60*60*24));
		list.add(new User("wangwu", now-1000*60*60*24));
		Collections.sort(list, new Comparator<User>() {
			//注册时间升序
			public int compare(User u1, User u2) {
				if(u1.getRegister_time()-u2.getRegister_time()>0){
					return 1;
				}
				if(u1.getRegister_time()-u2.getRegister_time()<0){
					return -1;
				}
				return 0;
			}
		});
		for(User u:list){
			System.out.println(u);
		}
	}
	
	public void testt02(){
		List<User> list=new ArrayList<User>();
		long now =new Date().getTime();
		list.add(new User("zhangsan", now));
		list.add(new User("lisi", now+1000*60*60*24));
		list.add(new User("wangwu", now-1000*60*60*24));
		Collections.sort(list, new Comparator<User>() {
			//按用户名升序
			public int compare(User u1, User u2) {
				if(u1.getUsername().compareTo(u2.getUsername())>0){
					return 1;
				}
				if(u1.getUsername().compareTo(u2.getUsername())<0){
					return -1;
				}
				return 0;
			}
		});
		for(User u:list){
			System.out.println(u);
		}		
	}
}

