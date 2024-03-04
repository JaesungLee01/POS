package com.pos.dao;

import java.util.List;
import java.util.Map;

import com.pos.vo.ProdVo;
import com.pos.vo.SalesProdVo;

public interface PosDao {
	// 상품 조회
		ProdVo selectProd(String barcode);
		Map<String, Object> salesProdOne(String barcode);
		// 시재금 등록
		int InsertPosMoney(Map<String, String> salesData);
		// 상품결제 등록
		void insertSales(Map<String, String> salesData);
		void insertSalesProduct(SalesProdVo salesProduct);
		void insertSalesPayment(SalesProdVo salesProduct);
		// 회원등록
		int SimInsertCust(Map<String,String> map);
		int insertCust(Map<String,String> map);
		// 고객 카운트
		int checkDuplicateCust(Map<String,String> param);
		// 시재금 불러오기
		String selectPayAmtBySerNo(String salesSerNo, String serNo);
		// 판매관리 조회
		List<Map<String, Object>> selectSales(Map<String, Object> map);
		// 판매 상세조회
		List<Map<String, Object>> salesProdListBySalesSerNo(String salesSerNo,String salesTy);
		
		 // 판매 취소 관련 메서드
	    void updateCancelTypeForFullCancel(String salesSerNo);
	    // 판매취소 업데이트
	    void updateCancelType(Map<String, Object> cancelInfo);
	    // 취소항목 카운트
	    int countSalesProdByTransTy(String salesSerNo);
	    
	    // 거래처 조회
	    List<Map<String, Object>> selectClient(Map<String, String> param);
	    
	    // 상품코드 불러오기
	    String calculatePos();
	    List<Map<String, Object>> selectProductType();
	    // 상품등록
	    int getMaxProdCd();
	    
	    int insertProduct(Map<String,String> param);
	    int checkDuplicateProduct(String PRODUCT_CD, String BAR_CODE);
	    
	    int getMaxClient();
	    int checkDuplicateClient(String CLIENT_NO, String BUSI_NO);
	    
	    int insertClient(Map<String,String> map);
	    
	    int selectSerNoByTransTy(String salesSerNo, String serNo);
	    List<Map<String, Object>> selectMembList(Map<String, String> param);
	    
	    int countMemberByMembSerNo(String membSerNo);
	    
	    int getMaxMembNo();
	    
	    List<String> selectSerNoBySalesSerNo(String salesSerNo);
	    String getSalesAmtBySerNo(Map<String, Object> paramMap);

}
