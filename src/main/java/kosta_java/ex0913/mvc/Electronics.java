package kosta_java.ex0913.mvc;
/**
 * 작성자 : 김지성
 * 작성일자 : 180912 
 * 작성주제 : MVC와 ArrayList의 이해
 */
class Electronics{
	private int modelNo;
	private String modelName;	
	private int modelPrice;		
	private String modelDetail;	
	
	Electronics(){}
	Electronics(int modelNo, String modelName){
		this.modelNo=modelNo;
		this.modelName=modelName;
	}
	Electronics(int modelNo, String modelName, int modelPrice, String modelDetail){
		this(modelNo,modelName);
		this.modelPrice=modelPrice;
		this.modelDetail=modelDetail;
	}

	public void setModelNo(int modelNo){
		this.modelNo = modelNo;
	}

	public void setModelName(String modelName){
		this.modelName = modelName;
	}

	public void setModelPrice(int modelPrice){
		this.modelPrice = modelPrice;
	}

	public void setModelDetail(String modelDetail){
		this.modelDetail = modelDetail;
	}

	public int getModelNo(){
		return modelNo;
	}

	public String getModelName(){
		return modelName;
	}

	public int getModelPrice(){
		return modelPrice;
	}

	public String getModelDetail(){
		return modelDetail;
	}

	public String toString(){
		return "모델번호 :" + this.modelNo +"모델명 "+ " | " +this.modelName + "모델가격 :" + this.modelPrice + " | " + "모델설명 :" + this.modelDetail;
	}
}