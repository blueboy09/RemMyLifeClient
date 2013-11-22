package com.remmylife.access;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Date;

import org.apache.axis2.AxisFault;

import com.remmylife.diary.xsd.*;
import com.remmylife.service.*;



	public class ManagerAccess {
		String target = "http://localhost:8080/axis2/services/ManagerService";
		ManagerService stub = null;
		
		
		void init(){
			try {
				stub = new ManagerServiceStub(target);
			} catch (AxisFault e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		public ManagerAccess() {
			init();
			
		}
		
		public ManagerAccess(String url) {
			target=url;
			init();
		}
		
		// user 的操作
		public boolean loginByName(String userName, String password){
			LoginByName lbn = new LoginByName();
			lbn.setUserName(userName);
			lbn.setPassword(password);
			try {
				LoginByNameResponse lbnr =  stub.loginByName(lbn);
				return lbnr.get_return();
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return false;
			}
			
		}
		
		public User getUser(User user){
			GetUser gu = new GetUser();
			gu.setUser(user);
			try {
				GetUserResponse gur = stub.getUser(gu);
				return gur.get_return();
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}
			
			
			
		}
		
		public boolean saveUser(User user){
			SaveUser su = new SaveUser();
			su.setUser(user);
			try {
				SaveUserResponse sur = stub.saveUser(su);
				return sur.get_return();
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return false;
			}
			
		}
		
		public boolean deleteUser(User user){
			DeleteUser du = new DeleteUser();
			du.setUser(user);
			try {
				DeleteUserResponse dur = stub.deleteUser(du);
				return dur.get_return();
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return false;
			}
			
		
		}
		
		// diary 的操作
		
		public boolean deleteDiary(Diary diary){
			DeleteDiary dd = new DeleteDiary();
			dd.setDiary(diary);
			try {
				DeleteDiaryResponse ddr = stub.deleteDiary(dd);
				return ddr.get_return();
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return false;
			}
			
	
		}
		
		public boolean saveDiary(Diary diary){
			SaveDiary sd = new SaveDiary();
			sd.setDiary(diary);
			try {
				SaveDiaryResponse sdr = stub.saveDiary(sd);
				return sdr.get_return();
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return false;
			}
	
		}
		
		public void shareDiary(Diary diary, User self){
			ShareDiary sd = new ShareDiary();
			sd.setDiary(diary);
			sd.setSelf(self);
			try {
				stub.shareDiary(sd);
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		
		public void unshareDiary(Diary diary, User self){
			UnshareDiary usd = new UnshareDiary();
			usd.setDiary(diary);
			usd.setSelf(self);
			try {
				stub.unshareDiary(usd);
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		
		
		public ArrayList<Diary> getDiaryList(User self, boolean own){
			Diary[] diaryarray = null;
			ArrayList<Diary> diarylist= new ArrayList<Diary>();
			GetDiaryList gdl = new GetDiaryList();
			gdl.setOwn(own);
			gdl.setSelf(self);
			GetDiaryListResponse gdlr;
			try {
				gdlr = stub.getDiaryList(gdl);
				diaryarray = gdlr.get_return();
				for(int i=0;i<diaryarray.length; i++){
					diarylist.add(diaryarray[i]);
				}
				return diarylist;
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}

		}
		
		public Diary getDiary(Diary diary){
			GetDiary gd = new GetDiary();
			gd.setDiary(diary);
			GetDiaryResponse gdr;
			try {
				gdr = stub.getDiary(gd);
				return gdr.get_return();
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}

		}
		
		// Comment
		public void saveComment(Diary diary,User user,String note){
			SaveComment sc = new SaveComment();
			sc.setDiary(diary);
			sc.setUser(user);
			sc.setNote(note);
			try {
				stub.saveComment(sc);
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			

		}
		
		public ArrayList<Comment> getComment(Diary diary){
			ArrayList<Comment> commentlist = new ArrayList<Comment>();
			Comment[] commentarray = null;
			GetComment gc = new GetComment();
			gc.setDiary(diary);
			try {
				GetCommentResponse gcr = stub.getComment(gc);
				commentarray = gcr.get_return();
				for(int i=0;i<commentarray.length; i++){
					commentlist.add(commentarray[i]);
				}
				return commentlist;
				
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}
			

		}
		
		
		
		
		// search
		public ArrayList<Diary> searchByTitle(String title, User self, boolean own){
			Diary[] diaryarray = null;
			ArrayList<Diary> diarylist= new ArrayList<Diary>();
			SearchByTitle sbt = new SearchByTitle();
			sbt.setOwn(own);
			sbt.setSelf(self);
			sbt.setTitle(title);
			SearchByTitleResponse sbtr;
			try {
				sbtr = stub.searchByTitle(sbt);
				diaryarray = sbtr.get_return();
				for(int i=0;i<diaryarray.length; i++){
					diarylist.add(diaryarray[i]);
				}
				return diarylist;
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}

		}
		
		public ArrayList<Diary> searchByDate(Date date, User self, boolean own){ 
			Diary[] diaryarray = null;
			ArrayList<Diary> diarylist= new ArrayList<Diary>();
			SearchByDate sbd = new SearchByDate();
			sbd.setDate(date);
			sbd.setOwn(own);
			sbd.setSelf(self);
			SearchByDateResponse sbdr = null; 
			try {
				sbdr = stub.searchByDate(sbd);
				diaryarray = sbdr.get_return();
				for(int i=0;i<diaryarray.length; i++){
					diarylist.add(diaryarray[i]);
				}
				return diarylist;
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}
		}
		
		public ArrayList<Diary> searchByType(DiaryType type, User self, boolean own){
			Diary[] diaryarray = null;
			ArrayList<Diary> diarylist= new ArrayList<Diary>();
			SearchByType sbt = new SearchByType();
			sbt.setOwn(own);
			sbt.setSelf(self);
			sbt.setType(type);
			SearchByTypeResponse sbtr = null;
			try {
				sbtr = stub.searchByType(sbt);
				diaryarray = sbtr.get_return();
				for(int i=0;i<diaryarray.length; i++){
					diarylist.add(diaryarray[i]);
				}
				return diarylist;
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}
		}
		
		public ArrayList<Diary> sortByDate(User self, boolean own){
			Diary[] diaryarray = null;
			ArrayList<Diary> diarylist= new ArrayList<Diary>();
			SortByDate sbd = new SortByDate();
			sbd.setOwn(own);
			sbd.setSelf(self);
			SortByDateResponse sbdr = null;
			try {
				sbdr = stub.sortByDate(sbd);
				diaryarray = sbdr.get_return();
				for(int i=0;i<diaryarray.length; i++){
					diarylist.add(diaryarray[i]);
				}
				return diarylist;
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}
		}
		
		public ArrayList<Diary> searchByContent(String content, User self, boolean own){
			Diary[] diaryarray = null;
			ArrayList<Diary> diarylist= new ArrayList<Diary>();
			SearchByContent sbc = new SearchByContent();
			sbc.setContent(content);
			sbc.setSelf(self);
			sbc.setOwn(own);
			SearchByContentResponse sbcr = null;
			try {
				sbcr = stub.searchByContent(sbc);
				diaryarray = sbcr.get_return();
				for(int i=0;i<diaryarray.length; i++){
					diarylist.add(diaryarray[i]);
				}
				return diarylist;
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}
		}

		
		
	}
		


