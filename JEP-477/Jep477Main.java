void main(){
//    var statement =  template("one", 1);
//    println(statement);

    var list = IntStream.range(0, 10).boxed()
        .map(i -> SampleFactory.createSample(i))
        .gather(Gatherers.windowFixed(3))
        .collect(Collectors.toList());
    println("list:" + list);
}

//String template(String name, int value){
//    return String.format("record name:%s value:%d", name, value);
//}
