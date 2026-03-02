using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class NoteOperationVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public bool? Success { get; set; }
        public int? NoteId { get; set; }
        public string? Uuid { get; set; }
        public string? Title { get; set; }
        public string? OperationType { get; set; }
        public string? OperationTime { get; set; }
        public string? Message { get; set; }
    }
}
