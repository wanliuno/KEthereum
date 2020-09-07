package org.walleth.kethereum.blockscout

import org.kethereum.model.Address
import org.kethereum.model.BlockExplorer

class BlockScoutBlockExplorer(private val baseURL: String) : BlockExplorer {

    override fun getAddressURL(address: Address) = "$baseURL/accounts/${address.hex}"
    override fun getTransactionURL(transactionHash: String) = "$baseURL/transactions/$transactionHash"
    override fun getBlockURL(blockNum: Long) = "$baseURL/blocks/$blockNum"

}
