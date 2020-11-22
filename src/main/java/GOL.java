//@SuppressWarnings("checkstyle:abbreviationaswordinname")

@SuppressWarnings({"PMD.ShortClassName", "PMD.AtLeastOneConstructor", "PMD.LoosePackageCoupling",
    "PMD.NoPackage"})
public class GOL {


  public String getClassName() {
    return this.getClass().getName();
  }

  public String getClassNameLowerCase() {
    return this.getClass().getName().toLowerCase();
  }
}