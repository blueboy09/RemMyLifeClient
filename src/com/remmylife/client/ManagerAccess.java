package com.remmylife.client;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Date;

import javax.activation.DataHandler;

import org.apache.axiom.attachments.ByteArrayDataSource;
import org.apache.axis2.AxisFault;

import com.remmylife.diary.*;
import com.remmylife.service.*;

	public class ManagerAccess {
		String target = "http://localhost:8080/RemMyLifeServer/services/RemMyLifeServer";
		RemMyLifeServer stub = null;
		
		
		void init(){
			try {
				stub = new RemMyLifeServerStub(target);
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
			byte[] bytes = Utils.convertToByteArray(user);
			DataHandler dataHandler = new DataHandler(new ByteArrayDataSource(bytes));
			gu.setUser(dataHandler);
			try {
				GetUserResponse gur = stub.getUser(gu);
				byte[] bytes2 = Utils.dataHandlerToBytes(gur.get_return());
				return (User) Utils.convertToObject(bytes2);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}
			
			
			
		}
		
		public boolean saveUser(User user){
			SaveUser su = new SaveUser();
			byte[] bytes = Utils.convertToByteArray(user);
			DataHandler dataHandler = new DataHandler(new ByteArrayDataSource(bytes));
			su.setUser(dataHandler);
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
			byte[] bytes = Utils.convertToByteArray(user);
			DataHandler dataHandler = new DataHandler(new ByteArrayDataSource(bytes));
			du.setUser(dataHandler);
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
			byte[] bytes = Utils.convertToByteArray(diary);
			DataHandler dataHandler = new DataHandler(new ByteArrayDataSource(bytes));
			dd.setDiary(dataHandler);
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
			byte[] bytes = Utils.convertToByteArray(diary);
			DataHandler dataHandler = new DataHandler(new ByteArrayDataSource(bytes));
			sd.setDiary(dataHandler);
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
			byte[] bytes = Utils.convertToByteArray(diary);
			DataHandler dataHandler = new DataHandler(new ByteArrayDataSource(bytes));
			sd.setDiary(dataHandler);
			byte[] bytes2 = Utils.convertToByteArray(self);
			DataHandler dataHandler2 = new DataHandler(new ByteArrayDataSource(bytes2));
			sd.setSelf(dataHandler2);
			try {
				stub.shareDiary(sd);
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		
		public void unshareDiary(Diary diary, User self){
			UnshareDiary usd = new UnshareDiary();
			byte[] bytes = Utils.convertToByteArray(diary);
			DataHandler dataHandler = new DataHandler(new ByteArrayDataSource(bytes));
			usd.setDiary(dataHandler);
			byte[] bytes2 = Utils.convertToByteArray(self);
			DataHandler dataHandler2 = new DataHandler(new ByteArrayDataSource(bytes2));
			usd.setSelf(dataHandler2);
			try {
				stub.unshareDiary(usd);
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		
		
		public ArrayList<Diary> getDiaryList(User self, boolean own) {
			ArrayList<Diary> diarylist= new ArrayList<Diary>();
			GetDiaryList gdl = new GetDiaryList();
			gdl.setOwn(own);
			byte[] bytes = Utils.convertToByteArray(self);
			DataHandler dataHandler = new DataHandler(new ByteArrayDataSource(bytes));
			gdl.setSelf(dataHandler);
			GetDiaryListResponse gdlr;
			try {
				gdlr = stub.getDiaryList(gdl);
				byte[] bytes2 = Utils.dataHandlerToBytes(gdlr.get_return());
				diarylist = (ArrayList<Diary>) Utils.convertToObject(bytes2);
				return diarylist;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}

		}
		
		public Diary getDiary(Diary diary){
			GetDiary gd = new GetDiary();
			byte[] bytes = Utils.convertToByteArray(diary);
			DataHandler dataHandler = new DataHandler(new ByteArrayDataSource(bytes));
			gd.setDiary(dataHandler);
			GetDiaryResponse gdr;
			try {
				gdr = stub.getDiary(gd);
				byte[] bytes2 = Utils.dataHandlerToBytes(gdr.get_return());
				return (Diary) Utils.convertToObject(bytes2);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}

		}
		
		// Comment
		public void saveComment(Diary diary,User user,String note){
			SaveComment sc = new SaveComment();
			byte[] bytes = Utils.convertToByteArray(diary);
			DataHandler dataHandler = new DataHandler(new ByteArrayDataSource(bytes));
			sc.setDiary(dataHandler);
			byte[] bytes2 = Utils.convertToByteArray(user);
			DataHandler dataHandler2 = new DataHandler(new ByteArrayDataSource(bytes2));
			sc.setUser(dataHandler2);
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
			GetComment gc = new GetComment();
			byte[] bytes = Utils.convertToByteArray(diary);
			DataHandler dataHandler = new DataHandler(new ByteArrayDataSource(bytes));
			gc.setDiary(dataHandler);
			try {
				GetCommentResponse gcr = stub.getComment(gc);
				byte[] bytes2 = Utils.dataHandlerToBytes(gcr.get_return());
				commentlist = (ArrayList<Comment>) Utils.convertToObject(bytes2);
				return commentlist;
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}
			

		}
		
		
		
		
		// search
		public ArrayList<Diary> searchByTitle(String title, User self, boolean own){
			ArrayList<Diary> diarylist= new ArrayList<Diary>();
			SearchByTitle sbt = new SearchByTitle();
			sbt.setOwn(own);
			byte[] bytes = Utils.convertToByteArray(self);
			DataHandler dataHandler = new DataHandler(new ByteArrayDataSource(bytes));
			sbt.setSelf(dataHandler);
			sbt.setTitle(title);
			SearchByTitleResponse sbtr;
			try {
				sbtr = stub.searchByTitle(sbt);
				byte[] bytes2 = Utils.dataHandlerToBytes(sbtr.get_return());
				diarylist = (ArrayList<Diary>) Utils.convertToObject(bytes2);
				return diarylist;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}

		}
		
		public ArrayList<Diary> searchByDate(Date date, User self, boolean own){ 
			ArrayList<Diary> diarylist= new ArrayList<Diary>();
			SearchByDate sbd = new SearchByDate();
			sbd.setDate(date);
			sbd.setOwn(own);
			byte[] bytes = Utils.convertToByteArray(self);
			DataHandler dataHandler = new DataHandler(new ByteArrayDataSource(bytes));
			sbd.setSelf(dataHandler);
			SearchByDateResponse sbdr = null; 
			try {
				sbdr = stub.searchByDate(sbd);
				byte[] bytes2 = Utils.dataHandlerToBytes(sbdr.get_return());
				diarylist = (ArrayList<Diary>) Utils.convertToObject(bytes2);
				return diarylist;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}
		}
		
		public ArrayList<Diary> searchByType(DiaryType type, User self, boolean own){
			ArrayList<Diary> diarylist= new ArrayList<Diary>();
			SearchByType sbt = new SearchByType();
			sbt.setOwn(own);
			byte[] bytes = Utils.convertToByteArray(self);
			DataHandler dataHandler = new DataHandler(new ByteArrayDataSource(bytes));
			sbt.setSelf(dataHandler);
			sbt.setType(type.name());
			SearchByTypeResponse sbtr = null;
			try {
				sbtr = stub.searchByType(sbt);
				byte[] bytes2 = Utils.dataHandlerToBytes(sbtr.get_return());
				diarylist = (ArrayList<Diary>) Utils.convertToObject(bytes2);
				return diarylist;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}
		}
		
		public ArrayList<Diary> sortByDate(User self, boolean own){
			ArrayList<Diary> diarylist= new ArrayList<Diary>();
			SortByDate sbd = new SortByDate();
			sbd.setOwn(own);
			byte[] bytes = Utils.convertToByteArray(self);
			DataHandler dataHandler = new DataHandler(new ByteArrayDataSource(bytes));
			sbd.setSelf(dataHandler);
			SortByDateResponse sbdr = null;
			try {
				sbdr = stub.sortByDate(sbd);
				byte[] bytes2 = Utils.dataHandlerToBytes(sbdr.get_return());
				diarylist = (ArrayList<Diary>) Utils.convertToObject(bytes2);
				return diarylist;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}
		}
		
		public ArrayList<Diary> searchByContent(String content, User self, boolean own){
			ArrayList<Diary> diarylist= new ArrayList<Diary>();
			SearchByContent sbc = new SearchByContent();
			sbc.setContent(content);
			byte[] bytes = Utils.convertToByteArray(self);
			DataHandler dataHandler = new DataHandler(new ByteArrayDataSource(bytes));
			sbc.setSelf(dataHandler);
			sbc.setOwn(own);
			SearchByContentResponse sbcr = null;
			try {
				sbcr = stub.searchByContent(sbc);
				byte[] bytes2 = Utils.dataHandlerToBytes(sbcr.get_return());
				diarylist = (ArrayList<Diary>) Utils.convertToObject(bytes2);
				return diarylist;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}
		}
		
	}
		


