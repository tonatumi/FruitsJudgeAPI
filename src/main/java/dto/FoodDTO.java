package dto;

public class FoodDTO {

    //プロパティ
    private String name;
    private String type;

    //名前の読み出し
    public String getName(){
        return name;
    }
    //名前のセット
    public void setName(String name){
        this.name = name;
    }
    //タイプの読み出し
    public String getType(){
        return type;
    }
    //タイプのセット
    public void setType(String type){
        this.type = type;
    }
}