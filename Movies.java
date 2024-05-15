public class Movies {
    public static void main(String[] args) {  
        String[] titles = new String[] {"Les Aventuriers de l'Arche perdue", "Indiana Jones et le Temple maudit", "Indiana Jones et la Dernière Croisade"};
        
        String[][] actors = {
            {"Harrison Ford", "Karen Allen", "Paul Freeman"},
            {"Harrison Ford", "Jonathan Ke Quan",""},
            {"Harrison Ford", "Sean Connery", "John Rhys-Davies"}
        };
        for (int i = 0 ; i < titles.length; i++) {
            System.out.println("Dans le film " + titles[i] + ", les principaux acteurs sont :");
            for (int j = 0 ; j < actors.length ; j++) {
                System.out.println(actors[i][j]);
            }
        }
    }
}
