using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class DocumentOperationVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public bool? Success { get; set; }
        public string? OperationType { get; set; }
        public string? Message { get; set; }
        public string? DocumentId { get; set; }
        public string? DocumentUuid { get; set; }
        public string? Title { get; set; }
        public string? OperationTime { get; set; }
    }
}
