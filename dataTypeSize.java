public class Solution {
    public static int dataTypes(String type) {
        // Write your code here

switch(type)
{
    case"Integer":
    return (Integer.SIZE/8);
    case "Long":
    return (Long.SIZE/8);
        case "Float":

        return (Float.SIZE / 8);

        case "Double":

        return (Double.SIZE / 8);
     case "Character":
     return 1;
    

}
return -1;
        
    }
}
