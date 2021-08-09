public class Test {

//    public static HashMap<List<ProductGroup>, Pair<List<ProductGroup>,List<ProductGroup>>> buildCatalogs(ArrayList<ProductGroup> array){
////        HashMap<List<ProductGroup>, Pair<List<ProductGroup>,List<ProductGroup>>> catalog = new HashMap<>(); // pakeisti
//
//        // filtering by section
//        List<ProductGroup> First = filterSection(array,"Null");
//        List<ProductGroup> buitinetechnika = filterSection(array,"4");
//        List<ProductGroup> tv = filterSection(array,"2");
//        List<ProductGroup> phones = filterSection(array,"3");
//        List<ProductGroup> sveikatairgrozis = filterSection(array,"1");
//        List<ProductGroup> indaploves3 = filterSection(array,"33");
//        List<ProductGroup> saldytuvai3 = filterSection(array,"31");
//        List<ProductGroup> garuSurinktuvai3 = filterSection(array,"34");
//        List<ProductGroup> kavosAparatai3 = filterSection(array,"10");
//        List<ProductGroup> ledEkranai3 = filterSection(array,"6");
//        List<ProductGroup> antenos3 = filterSection(array,"32");
//        List<ProductGroup> smartphones3 = filterSection(array,"5");
//        List<ProductGroup> telefonuaparatai3 = filterSection(array,"8");
//        List<ProductGroup> telefonupriedai3 = filterSection(array,"7");
//        List<ProductGroup> fenai = filterSection(array,"9");
//
//        // grouping together second and third section.
//        HashMap<String,List<ProductGroup>> indaploves2 = new HashMap<>();
//        indaploves2.put(parentIdToString(buitinetechnika,33),indaploves3);
//        HashMap<String,List<ProductGroup>> saldytuvai2 = new HashMap<>();
//        saldytuvai2.put(parentIdToString(buitinetechnika,31),saldytuvai3);
//        HashMap<String,List<ProductGroup>> garuSurinktuvai2 = new HashMap<>();
//        garuSurinktuvai2.put(parentIdToString(buitinetechnika,34),garuSurinktuvai3);
//        HashMap<String,List<ProductGroup>> kavosAparatai2 = new HashMap<>();
//        kavosAparatai2.put(parentIdToString(buitinetechnika,10),kavosAparatai3);
//        HashMap<String,List<ProductGroup>> ledEkranai2 = new HashMap<>();
//        ledEkranai2.put(parentIdToString(tv,6),ledEkranai3);
//        HashMap<String,List<ProductGroup>> antenos2 = new HashMap<>();
//        antenos2.put(parentIdToString(tv,32),antenos3);
//        HashMap<String,List<ProductGroup>> smartphones2 = new HashMap<>();
//        smartphones2.put(parentIdToString(phones,5),smartphones3);
//        HashMap<String,List<ProductGroup>> telefonuaparatai2 = new HashMap<>();
//        telefonuaparatai2.put(parentIdToString(phones,8),telefonuaparatai3);
//        HashMap<String,List<ProductGroup>> telefonupriedai2 = new HashMap<>();
//        telefonupriedai2.put(parentIdToString(phones,7),telefonupriedai3);
//        HashMap<String,List<ProductGroup>> sveikatairgrozis2 = new HashMap<>();
//        sveikatairgrozis2.put(parentIdToString(sveikatairgrozis,9),fenai);
//
//
//        // adding to values
//        HashMap<List<ProductGroup>,HashMap<String,List<ProductGroup>>> finalCatalog= new HashMap<>();
//        finalCatalog.merge()
//
//
//        return catalog;}
//
//public static List<ProductGroup> filterSection(ArrayList<ProductGroup> array,String parentID){
//        return array.stream().filter(product -> product.getParentId().equals(parentID)).collect(Collectors.toList());}
//
//public static String parentIdToString(List<ProductGroup> list1,int id){
//        return list1.stream().filter(product -> product.getId()==id).map(ProductGroup::getName).findFirst().toString();}
}
