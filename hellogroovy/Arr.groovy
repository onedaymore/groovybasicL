class Arr{

    static void main (String [] args){
        def prims = [2,3,4,6];

        println(prims[1]);

        println(prims.get(0));
        
        
        prims = ["BLAD",3,4,6,[1,2,3]];
        
        println prims[0];
        println(prims[4][1]);
        
        println(prims.size);
        println(prims.size());
         println(prims.isEmpty());
        
        prims.add(17); //添加元素
        prims<<19; //添加元素
        println(prims[5]);
        
        prims + [22,31]; // ?
        println(prims[7]);
        prims - [31]; // ?
        
        
        println(prims[0..3]);
         println(prims);
          println(prims.reverse());
           println(prims.sort());
           println(prims.pop());
         
    }

}