public class practica13 {
    static class Animal {
        private String name;
        private String rusName;

        public Animal(String name, String rusName) {
            this.name = name;
            this.rusName = rusName;
        }

        // переопределение метода equals()
        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }

            // проверка на null и тип
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }

            Animal other = (Animal) obj;

            return this.name.equals(other.name) && this.rusName.equals(other.rusName);
        }

        // переопределение метода hashCode() для соблюдения контракта equals() и hashCode()
        @Override
        public int hashCode() {
            int result = name.hashCode();
            result = 31 * result + rusName.hashCode();
            return result;
        }
    }
    public static void main(String[] args) {
        Animal dog1 = new Animal("Dog", "Собака");
        Animal dog2 = new Animal("Dog", "Собака");
        Animal cat = new Animal("Cat", "Кошка");

        System.out.println(dog1.equals(dog2)); // true
        System.out.println(dog1.equals(cat));  // false
    }
}
