using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class PointsTransferVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? TransactionId { get; set; }
        public string? FromAccountId { get; set; }
        public string? ToAccountId { get; set; }
        public int? Points { get; set; }
        public string? Status { get; set; }
        public int? FromPointsAfter { get; set; }
        public int? ToPointsAfter { get; set; }
    }
}
