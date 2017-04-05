package examples;

public class EqualsAndHashCodeOverridingExample {

    public static void main(String[] args) {

        System.out.println("\nComparison of objects without overridden equals() and hashCode()");
        Brand brand1 = new Brand("1", "BMW");
        Brand brand2 = new Brand("1", "BMW");
        System.out.println(String.format("Brand 1:\n%s\nBrand 2:\n%s\nbrand1.equals(brand2) --> %s",
                                         brand1.toString(), brand2.toString(), brand1.equals(brand2)));

        System.out.println("\nComparison of objects with overridden equals() and hashCode()");
        BrandWithOverriddenEqualsAndHashCode brandOverridden1 = new BrandWithOverriddenEqualsAndHashCode("1", "BMW");
        BrandWithOverriddenEqualsAndHashCode brandOverridden2 = new BrandWithOverriddenEqualsAndHashCode("1", "BMW");
        System.out.println(String.format("Brand 1:\n%s\nBrand 2:\n%s\nbrand1.equals(brand2) --> %s",
                                         brandOverridden1.toString(), brandOverridden2.toString(),
                                         brandOverridden1.equals(brandOverridden2)));
    }

    private static class Brand {

        private String id;
        private String name;

        public Brand(String id, String name) {
            this.id = id;
            this.name = name;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Brand{" +
                   "id='" + id + '\'' +
                   ", name='" + name + '\'' +
                   '}';
        }
    }

    private static class BrandWithOverriddenEqualsAndHashCode {

        private String id;
        private String name;

        public BrandWithOverriddenEqualsAndHashCode(String id, String name) {
            this.id = id;
            this.name = name;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Brand{" +
                   "id='" + id + '\'' +
                   ", name='" + name + '\'' +
                   '}';
        }

        @Override
        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (object == null || getClass() != object.getClass()) {
                return false;
            }

            BrandWithOverriddenEqualsAndHashCode that = (BrandWithOverriddenEqualsAndHashCode) object;

            if (id != null ? !id.equals(that.id) : that.id != null) {
                return false;
            }
            return name != null ? name.equals(that.name) : that.name == null;

        }

        @Override
        public int hashCode() {
            int result = id != null ? id.hashCode() : 0;
            result = 31 * result + (name != null ? name.hashCode() : 0);
            return result;
        }
    }
}
