import fr.ekwateur.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ApplicationTests {

    @Test
    void test_elec_client_particulier(){
        Facturaion facturaionElec = consommation -> consommation * 0.133;
        Energie electricitePart = new Energie(EnergieEnum.ELECTRICITE.getName(), facturaionElec);
        double montantPart = OperationsFacturation.calculerFactureMensuel(electricitePart, 100);

        double expected = 372.0;
        Assertions.assertEquals(expected, montantPart);
    }
    @Test
    void test_gaz_client_particulier(){
        Facturaion facturaionGaz = consommation -> consommation * 0.108;
        Energie gazPart = new Energie(EnergieEnum.GAZ.getName(), facturaionGaz);
        double montantPart = OperationsFacturation.calculerFactureMensuel(gazPart, 100);

        double expected = 302.0;
        Assertions.assertEquals(expected, montantPart);
    }

    @Test
    void test_gaz_client_pro_ca_egal_max(){
        ClientPro clientPro = new ClientPro("EKW834234", "XXXXXXX", "Entreprise B", 1000000);
        Facturaion facturationPro = consommation -> consommation * ((clientPro.getCa() > 1000000) ? 0.123 : 0.117);
        Energie gazPro = new Energie(EnergieEnum.GAZ.getName(), facturationPro);
        double montantPro = OperationsFacturation.calculerFactureMensuel(gazPro, 200);
        double expected = 655.0;
        Assertions.assertEquals(expected, montantPro);
    }
    @Test
    void test_elec_client_pro_ca_egal_max(){
        ClientPro clientPro = new ClientPro("EKW834234", "XXXXXXX", "Entreprise B", 1000000);
        Facturaion facturationPro = consommation -> consommation * ((clientPro.getCa() > 1000000) ? 0.110 : 0.112);
        Energie gazPro = new Energie(EnergieEnum.ELECTRICITE.getName(), facturationPro);
        double montantPro = OperationsFacturation.calculerFactureMensuel(gazPro, 200);
        double expected = 627.0;
        Assertions.assertEquals(expected, montantPro);
    }


    @Test
    void test_gaz_client_pro_ca_inf_max(){
        ClientPro clientPro = new ClientPro("EKW331023", "XXXXXXX", "Entreprise A", 1500);
        Facturaion facturationPro = consommation -> consommation * ((clientPro.getCa() > 1000000) ? 0.123 : 0.117);
        Energie gazPro = new Energie(EnergieEnum.GAZ.getName(), facturationPro);
        double montantPro = OperationsFacturation.calculerFactureMensuel(gazPro, 200);
        double expected = 655.0;
        Assertions.assertEquals(expected, montantPro);
    }
    @Test
    void test_elec_client_pro_ca_inf_max(){
        ClientPro clientPro = new ClientPro("EKW331023", "XXXXXXX", "Entreprise A", 1500);
        Facturaion facturationPro = consommation -> consommation * ((clientPro.getCa() > 1000000) ? 0.110 : 0.112);
        Energie gazPro = new Energie(EnergieEnum.ELECTRICITE.getName(), facturationPro);
        double montantPro = OperationsFacturation.calculerFactureMensuel(gazPro, 200);
        double expected = 627.0;
        Assertions.assertEquals(expected, montantPro);
    }


    @Test
    void test_gaz_client_pro_ca_sup_max(){
        ClientPro clientPro = new ClientPro("EKW834234", "XXXXXXX", "Entreprise B", 2000000);
        Facturaion facturationPro = consommation -> consommation * ((clientPro.getCa() > 1000000) ? 0.123 : 0.117);
        Energie gazPro = new Energie(EnergieEnum.GAZ.getName(), facturationPro);
        double montantPro = OperationsFacturation.calculerFactureMensuel(gazPro, 200);
        double expected = 689.0;
        Assertions.assertEquals(expected, montantPro);
    }
    @Test
    void test_elec_client_pro_ca_sup_max(){
        ClientPro clientPro = new ClientPro("EKW834234", "XXXXXXX", "Entreprise B", 2000000);
        Facturaion facturationPro = consommation -> consommation * ((clientPro.getCa() > 1000000) ? 0.110 : 0.112);
        Energie gazPro = new Energie(EnergieEnum.ELECTRICITE.getName(), facturationPro);
        double montantPro = OperationsFacturation.calculerFactureMensuel(gazPro, 200);
        double expected = 616.0;
        Assertions.assertEquals(expected, montantPro);
    }
}
