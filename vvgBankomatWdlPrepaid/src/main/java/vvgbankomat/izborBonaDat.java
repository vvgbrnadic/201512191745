package vvgbankomat;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class izborBonaDat implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label(value = "Bonbon")
   private java.lang.Boolean bonbon;
   @org.kie.api.definition.type.Label(value = "THT")
   private java.lang.Boolean tht;
   @org.kie.api.definition.type.Label(value = "Vip")
   private java.lang.Boolean vip;
   @org.kie.api.definition.type.Label(value = "Hac")
   private java.lang.Boolean hac;
   @org.kie.api.definition.type.Label(value = "Tele2")
   private java.lang.Boolean tele2;
   @org.kie.api.definition.type.Label(value = "Dencal")
   private java.lang.Boolean dencal;

   public izborBonaDat()
   {
   }

   public java.lang.Boolean getBonbon()
   {
      return this.bonbon;
   }

   public void setBonbon(java.lang.Boolean bonbon)
   {
      this.bonbon = bonbon;
   }

   public java.lang.Boolean getTht()
   {
      return this.tht;
   }

   public void setTht(java.lang.Boolean tht)
   {
      this.tht = tht;
   }

   public java.lang.Boolean getVip()
   {
      return this.vip;
   }

   public void setVip(java.lang.Boolean vip)
   {
      this.vip = vip;
   }

   public java.lang.Boolean getHac()
   {
      return this.hac;
   }

   public void setHac(java.lang.Boolean hac)
   {
      this.hac = hac;
   }

   public java.lang.Boolean getTele2()
   {
      return this.tele2;
   }

   public void setTele2(java.lang.Boolean tele2)
   {
      this.tele2 = tele2;
   }

   public java.lang.Boolean getDencal()
   {
      return this.dencal;
   }

   public void setDencal(java.lang.Boolean dencal)
   {
      this.dencal = dencal;
   }

   public izborBonaDat(java.lang.Boolean bonbon, java.lang.Boolean tht,
         java.lang.Boolean vip, java.lang.Boolean hac,
         java.lang.Boolean tele2, java.lang.Boolean dencal)
   {
      this.bonbon = bonbon;
      this.tht = tht;
      this.vip = vip;
      this.hac = hac;
      this.tele2 = tele2;
      this.dencal = dencal;
   }

}