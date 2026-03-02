using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class CashWithdrawForm
    {
        public double? Amount { get; set; }
        public string? WithdrawMethod { get; set; }
        public string? AccountNo { get; set; }
        public string? AccountName { get; set; }
        public string? BankName { get; set; }
        public string? Remarks { get; set; }
    }
}
