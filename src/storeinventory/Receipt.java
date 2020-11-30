/**
 * 
 */
package storeinventory;

import java.util.List;

/**
 * @author kapilfreeman
 *
 */
public interface Receipt {
	public String getFormattedTotal();
	public List<String> getOrderedItems();

}
