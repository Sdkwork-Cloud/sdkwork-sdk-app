using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class PointsTransferForm
    {
        public string? ToUserId { get; set; }
        public int? Points { get; set; }
        public string? Remarks { get; set; }
    }
}
