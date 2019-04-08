
package multi_thread_example;


public class mythread implements Runnable {
    
    int k=0;
    String name;
    
    public mythread(String name){
    
    this.name=name;
    
    }
    
    @Override
    public void run(){
    
      for(int i=0;i<10;i++){
        
        try{Thread.sleep(500);} catch(InterruptedException e){}
        System.out.println(name+"\t"+k);
        k=k+5;
      }
   
    }
}
