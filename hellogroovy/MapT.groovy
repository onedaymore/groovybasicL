class MapT{

    static void main(String []args) {
        def map = [
        'name':'Tony',
        'age': 19,
        'list': [1,2,3]
        ];
        
        println(map['name']);
        println(map['list'][2]);
        
        map.put('city', "Noyd");
        println(map['city']);
        map.put('city', 'SanFron');
        println(map['city']);
        println(map.containsKey('city'));
    }
}