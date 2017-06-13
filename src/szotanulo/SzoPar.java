/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package szotanulo;

import java.util.Objects;

/**
 *
 * @author Mihály
 */
public class SzoPar implements Comparable<SzoPar>{
    private String angol;
    private String magyar;
    
    public SzoPar(){
        
    }

    public SzoPar(String angol, String magyar) {
        this.angol = angol;
        this.magyar = magyar;
    }

    public String getAngol() {
        return angol;
    }

    public void setAngol(String angol) {
        this.angol = angol;
    }

    public String getMagyar() {
        return magyar;
    }

    public void setMagyar(String magyar) {
        this.magyar = magyar;
    }

    @Override
    public String toString() {
        return "SzoPar{" + "angol=" + angol + ", magyar=" + magyar + '}';
    }
    
   

   

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final SzoPar other = (SzoPar) obj;
        if (!Objects.equals(this.angol, other.angol)) {
            return false;
        }
        if (!Objects.equals(this.magyar, other.magyar)) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(SzoPar o) {
      if(this.magyar.compareTo(o.magyar)==1){
          return 1;
      }
      if(this.magyar.compareTo(o.magyar)==-1){
          return -1;
      }
      return 0;
    }
    
    
    
    
}
