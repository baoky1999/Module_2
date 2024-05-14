package Baitap.CircleAndCylinder;

public class Cylinder extends Circle {
        private double height;


        public Cylinder(double radius, String color, double height) {
            super(radius, color);
            this.height = height;
        }

        public double getHeight() {
            return height;
        }

        public void setHeight(double height) {
            this.height = height;
        }

        public double getVolume() {
            return Math.PI * ( getRadius() * getRadius() ) * height  ;
        }

        @Override
        public String toString() {
            return "Radius = " + getRadius() + ", Height = " + height
                    + " Volume = " + getVolume()
                    + ", which is a supclass of "
                    + super.toString();
        }
}
