using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class WalletExchangeForm
    {
        public int? Points { get; set; }
        public string? Target { get; set; }
        public string? RequestNo { get; set; }
        public string? Remarks { get; set; }
    }
}
