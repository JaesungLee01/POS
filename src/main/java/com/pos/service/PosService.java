package com.pos.service;

import java.util.List;
import java.util.Map;


public interface PosService {
	 //pos화면 상품조회
	 Map<String, Object> salesProdOne(String barcode);
	
	
	 void insertPosMoney(Map<String, String> salesData);
	
	 void insertSales(Map<String,String> salesData,List<Map<String,String>> salesList);
	 
	 int SimInsertCust(Map<String, String> param);
	 
	 List<Map<String, Object>> selectSales(Map<String, Object> paramMap);

	 List<Map<String, Object>> salesProdListBySalesSerNo(String salesSerNo,String salesTy);
	 
	 int cancelSales(String salesSerNo, String[] serNos, boolean isFullCancel);
	 
	 
	 List<Map<String, Object>> selectClient(Map<String, String> param);
	 
	 List<Map<String, Object>> selectProductType();
	 
	 int insertProduct(Map<String, String> param);
	 
	 
	 String calculatePos();
	 int getMaxProdCd();
	 
	 int getMaxClient();
	 int insertClient(Map<String,String> map);
	 
	 int selectSerNoByTransTy(String salesSerNo, String serNo);
	 List<Map<String, Object>> selectMembList(Map<String, String> param);
	  int countMemberByMembSerNo(String membSerNo);
	  
	  int getMaxMembNo(); 
	  
	  int insertCust(Map<String,String> map);



	
}
