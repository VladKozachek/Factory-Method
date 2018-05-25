public class Factory {
    public IMobilePhone create(String typeOfMobile){
        switch (typeOfMobile){
            case "Nokia":
                return new Nokia();
            case "Samsung":
                return new Samsung();
                default:
                    return null;
        }
    }
}
