package exception;

import java.util.ArrayList;
import java.util.List;

public class ObjectNullException extends Exception{
    private List<String> errorMessageList;
    public ObjectNullException(){
        errorMessageList = new ArrayList<>();
    }
    public void setErrorMessage(String message){
        errorMessageList.add(message);
    }

    public List<String> getErrorMessage(){
        return errorMessageList;
    }

    public void showLog(){
        if(errorMessageList.isEmpty()){
            System.out.println("ErrorMessage dose'nt exist");
            return;
        }
        for(String errorMessage:errorMessageList){
            System.out.println(errorMessage);
        }
    }
}
