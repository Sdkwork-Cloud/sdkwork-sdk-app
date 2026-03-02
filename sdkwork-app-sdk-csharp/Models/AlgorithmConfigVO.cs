using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class AlgorithmConfigVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? AlgorithmType { get; set; }
        public object? AlgorithmParams { get; set; }
        public string? Version { get; set; }
    }
}
