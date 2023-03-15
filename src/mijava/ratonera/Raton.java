package mijava.ratonera;
/** @autor Tomás Ceés
 * @version 2
 */
public class Raton {
    private int edad;        /**@value edad en dias, @since 1*/
    private double peso;        /**@value peso en gramos, @since 1 */
    private double tasaCrecimiento; /**@valor incremento del peso en dias, en tanto por ciento, @since 1 */

    public Raton(){
    }
    /**@since  2 */

    public Raton(int edad, double peso) {
        this.edad = edad;
        this.peso = peso;
        this.tasaCrecimiento=0.1;
    }

    /**
     * @return un dia de crecimiento
     * @since 1
     */
    public void desarrollar() {
        this.setPeso(this.getPeso() + (this.getPeso() * this.getTasaCrecimiento() /100.0));
        this.setEdad(this.getEdad() + 1);
    }

    /**
     *
     * @return formateada la edad y el peso del ratón
     * @since 1
     */
    public String datos() {
        return String.format("(%d;%.2f)", this.getEdad(), this.getPeso());
    }

    /**
     * @since 2
     * @return edad
     */
    public int getEdad() {
        return edad;
    }
    /**
     * @since 2
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @since 2
     */
    public double getPeso() {
        return peso;
    }
    /**
     * @since 2
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * @since 2 {@link @https://es.wikipedia.org/wiki/Rat%C3%B3n de laboratorio}
     *
     */
    public double getTasaCrecimiento() {
        return tasaCrecimiento;
    }
    /**
     * @since 2 {@link <a href="https://es.wikipedia.org/wiki/Rat%C3%B3n de laboratorio">wikipedia</a>}
     *
     */
    public void setTasaCrecimiento(double tasaCrecimiento) {
        this.tasaCrecimiento = tasaCrecimiento;
    }
}
