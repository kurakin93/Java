package java_familiarity_intro.HW2.model;

public class Vector {
    private Double x;
    private Double y;
    private Double z;

    public Vector() {
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Vector(Double x, Double y, Double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public Double getZ() {
        return z;
    }

    public void setZ(Double z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    /**
     * Метод, вычисляющий длину вектора
     */
    public double lenghtvector() {
        return Math.sqrt(this.x * this.x + this.z * this.z + this.y * this.y);
    }

    /**
     * @param vector2 второй вектор для произведения
     * @return скалярное произведение
     */
    public double scalarMulti(Vector vector2) {
        return this.x * vector2.x + this.y * vector2.y + this.z * vector2.z;
    }

    /**
     * @param vector2 второй вектор
     * @return векторное произведение с другим вектором
     */
    public Vector vectorMulti(Vector vector2) {
        return new Vector(this.y * vector2.z - this.z * vector2.y,
                this.z * vector2.x - this.x * vector2.z,
                this.x * vector2.y - this.y * vector2.x);
    }

    /**
     * @param vector2 второй вектор
     * @return косинус угла
     */
    public double cosVector(Vector vector2) {
        return scalarMulti(vector2) / (lenghtvector() * vector2.lenghtvector());
    }

    /**
     *
     * @param vector2 второй вектор
     * @return разность векторов
     */
    public Vector difVector(Vector vector2) {
        return new Vector(this.x - vector2.x, this.y - vector2.y, this.z - vector2.z);
    }

    /**
     *
     * @param vector2 второй вектор
     * @return сумму векторов
     */
    public Vector sumVector(Vector vector2) {
        return new Vector(this.x + vector2.x, this.y + vector2.y, this.z + vector2.z);
    }
}

